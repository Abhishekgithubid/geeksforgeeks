//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
    
                String s;
                s = br.readLine();
    
                Solution obj = new Solution();
                String res = obj.removeOuter(s);
    
                System.out.println(res);
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        public static String removeOuter(String s) {
            // code here
            int openCount = 0;
            int closeCount = 0;
            String result = "";
            int start = 0;
     
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    openCount++;
                } else if (c == ')') {
                    closeCount++;
                }
     
                if (openCount == closeCount) {
                    result += s.substring(start+1, i);
                    start = i+1;
                }
            }
     
            return result;
        }
    }
    