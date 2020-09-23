import java.util.*;

class Codec {
    HashMap<String, String> map = null;
    HashSet<String> set = null;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(map==null){
            map = new HashMap<>();
        }
        if(set==null){
            set = new HashSet<>();
        }
        
        Random random = new Random();
        String allowedChars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        int length = (5+random.nextInt(20))%20;
        String code = generateCode(allowedChars,length);
        while(set.contains(code)){
            code = generateCode(allowedChars,length);
        }
        set.add(code);
        map.put(code,longUrl);
        return code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
    private String generateCode(String allowedChars, int length){
        char[] generatedChars = new char[length];
        Random random = new Random();
        for(int i=0;i<length;i++){
            generatedChars[i] = allowedChars.charAt(random.nextInt(allowedChars.length()));
        }
        return generatedChars.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));