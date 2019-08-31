class Solution {
	    public boolean isSubsequence(String s, String t) {
		            int foo = 0;
			            if (s.length() == 0) return true;
				            if ( t.length() == 0) return false;
					            for(int i = 0; i < t.length(); i++){
							                // System.out.println(s.charAt(foo)+ ", "+t.charAt(i)+", "+foo);
									//             if(s.charAt(foo) == t.charAt(i))
									//                             foo++;
									//                                         if(foo == s.length())
									//                                                         return true;
									//                                                                 }
									//                                                                         return false;
									//                                                                             }
									//                                                                             }
									//
									//                                                                             // Greedy Algorithm approach for https://leetcode.com/problems/is-subsequence/
