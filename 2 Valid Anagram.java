class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;
        HashMap <Character, Integer> ha=new HashMap();
        for (int i=0; i<s.length();i++){
            Integer val=ha.get(s.charAt(i));
            if(val!=null){
                val+=1;
                ha.put(s.charAt(i), val);
            }
            else{ha.put(s.charAt(i), 1);}
            //if (s[i]!=t[cont]) return false;
        }
        for (int i=0;i<t.length();i++){
            Integer val=ha.get(t.charAt(i));
            if(val==null)return false;
            val-=1;
            if (val==0) ha.remove(t.charAt(i));
            else ha.put(t.charAt(i), val);
        }
        if (ha.size()==0)return true;
        return false;
    }
}
