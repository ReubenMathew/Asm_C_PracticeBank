public class Codec {
	    private Map<String, String> db = new HashMap<String, String>();
	        // Encodes a URL to a shortened URL.
		//     public String encode(String longUrl) {
		//             int rand;
		//                     do{
		//                             rand = (int) Math.random() * 99999999 + 1;
		//                                     }while(db.containsKey(rand));
		//                                             String enc = "http://tinyurl.com/"+("00000000" + String.valueOf(rand)).substring(String.valueOf(rand).length());
		//                                                     db.put(enc,longUrl);
		//                                                             return enc;
		//                                                                 }
		//
		//                                                                     // Decodes a shortened URL to its original URL.
		//                                                                         public String decode(String shortUrl) {
		//                                                                                 return db.get(shortUrl);
		//                                                                                     }
		//                                                                                     }
		//
		//                                                                                     // Your Codec object will be instantiated and called as such:
		//                                                                                     // Codec codec = new Codec();
		//                                                                                     // codec.decode(codec.encode(url))
		//                                                                                     // From: https://leetcode.com/problems/encode-and-decode-tinyurl/submissions/;
