
import java.util.ArrayList;
import java.util.Iterator;

public class RemoteControl implements Iterable<String>{
    private ArrayList<String>  channels = new ArrayList<String>();
    
    public void addChannel(String channel) {
        
        channels.add(channel);
    }
    
    public void deleteChannel(String channel) {
        if (channel.contains(channel)) {
        channels.remove(channel);
        }
        else {
            System.out.println("Boyle bir kanal bulunmuyor");
        }
    }
    
    public int numberOfChannels() {
        return channels.size();
    }

    @Override
    public Iterator<String> iterator() {
        return new RemotControlIterator();
    }
    
    public class RemotControlIterator implements Iterator<String> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            
            if (index < channels.size()) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public String next() {
            
            String channel = channels.get(index);
            index++;
            return channel;
        }
        
    }
    
}

