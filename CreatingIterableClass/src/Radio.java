
import java.util.ArrayList;
import java.util.Iterator;

public class Radio implements Iterable<String>{
    
    private ArrayList<String> listOfChannels = new ArrayList<String>();
   
    
    public class RadioIterator implements Iterator<String> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            
            if (index < listOfChannels.size()) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public String next() {
            
            String deger = listOfChannels.get(index);
            index++;
            return deger;
        }
        
        
    }
    
    public Radio(String[] channels) {
        for (String channel : channels) {
                listOfChannels.add(channel);
        }
    }

    @Override
    public Iterator<String> iterator() {
       // return listOfChannels.iterator();
       return new RadioIterator();
       
       
    }
    
}
