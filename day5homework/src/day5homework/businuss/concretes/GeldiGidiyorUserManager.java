package day5homework.businuss.concretes;

import java.util.Scanner;

import day5homework.adapter.abstracts.ExternelUserService;
import day5homework.businuss.abstracts.UserService;
import day5homework.core.abstracts.EmailValidationService;
import day5homework.core.abstracts.PasswordValidationServide;
import day5homework.core.abstracts.UserNameValidationService;
import day5homework.core.abstracts.VerificationService;
import day5homework.dataAccess.abstracts.UserDao;
import day5homework.entities.concretes.User;

public class GeldiGidiyorUserManager implements UserService {

	
	private EmailValidationService emailValidator;
	private PasswordValidationServide passwordValidator;
	private UserNameValidationService userNameValidator;
	private UserDao userdao;
	private VerificationService verifyEmail;
	private ExternelUserService externelService;
	
	
	
	
	public GeldiGidiyorUserManager(EmailValidationService emailValidator, PasswordValidationServide passwordValidator,
			UserNameValidationService userNameValidator, UserDao userdao, VerificationService verifyEmail,
			ExternelUserService externelService) {
		super();
		this.emailValidator = emailValidator;
		this.passwordValidator = passwordValidator;
		this.userNameValidator = userNameValidator;
		this.userdao = userdao;
		this.verifyEmail = verifyEmail;
		this.externelService = externelService;
	}

	
	public void signInByDefault(User user) {
		
		boolean isContain = userdao.getEmail().contains(user.getEmail());
		
		if (!isContain) {
			
			if (emailValidator.isValidEmail(user) && passwordValidator.isPasswordValid(user)
					&& userNameValidator.isValidUserName(user) && verifyEmail.isVarified(user)
					) {
					userdao.add(user);
				}
				else {
					try {
						throw new Exception("Kullanıcı ismi ve soyismi en az iki karakter olmalı.\n"
										  + "Şifre en az 6 rakam dan oluşmalı.\n"
										  + "Email address standart email addresi olaml.\n"
										  + "örneğin: example@mail.com");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		}else {
			System.out.println("This email address is used by another User.");
		}

		
		
	}

	@Override
	public void login(User user) {
		
		boolean isContain = userdao.getEmail().contains(user.getEmail());

		if (userdao.isContain(user)) {
			System.out.println("Welcome " + user.getFirstName() + " " + user.getLastName());
		}
		else {
			System.out.println("Before you login you should signUp.");
		}
	}

	@Override
	public void signIn(User user) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter google or default to sign in with google or default.");
		String select = scan.nextLine();
		while(true) {
			if(select.equals("google")) {
				externelService.signIn(user);
				return;
			}
			else if (select.equals("default")) {
				signInByDefault(user);
				return;
			}
		}
		
	}

}
