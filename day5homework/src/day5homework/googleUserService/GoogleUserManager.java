package day5homework.googleUserService;

import day5homework.core.abstracts.EmailValidationService;
import day5homework.core.abstracts.PasswordValidationServide;
import day5homework.core.abstracts.UserNameValidationService;
import day5homework.core.abstracts.VerificationService;
import day5homework.dataAccess.abstracts.UserDao;
import day5homework.entities.concretes.User;

public class GoogleUserManager {

	

	private EmailValidationService emailValidator;
	private PasswordValidationServide passwordValidator;
	private UserNameValidationService userNameValidator;
	private GoogleDao userdao;
	private VerificationService verifyEmail;
	
	public GoogleUserManager(EmailValidationService emailValidator, PasswordValidationServide passwordValidator,
			UserNameValidationService userNameValidator, GoogleDao userdao, VerificationService verifyEmail) {
		super();
		this.emailValidator = emailValidator;
		this.passwordValidator = passwordValidator;
		this.userNameValidator = userNameValidator;
		this.userdao = userdao;
		this.verifyEmail = verifyEmail;
	}
	
public void signIn(User user) {
		
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

	
	public void login(User user) {
		
		boolean isContain = userdao.getEmail().contains(user.getEmail());

		if (userdao.isContain(user)) {
			System.out.println("Welcome " + user.getFirstName() + " " + user.getLastName());
		}
		else {
			System.out.println("Before you login you should signUp.");
		}
	}
}
