class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap <String,

        HashMap <String, ArrayList<String>> hm = new HashMap();

        for (int i=0; i<strs.length;i++){
            char [] pal1=strs[i].toCharArray().clone();
            Arrays.sort(pal1);
            String pal=new String(pal1);
            ArrayList <String> aux=hm.get(pal);
            if (aux==null){
                aux=new ArrayList<>();
                aux.add(strs[i]);
                hm.put(pal, aux);
            }
            else{
                aux.add(strs[i]);
            }
        }
        List<List<String>> fin=new ArrayList();

        for (String s: hm.keySet()){
            System.out.println(s+hm.get(s));
            fin.add(hm.get(s));
        }
        List<List<String>> lista=new ArrayList<> ();
        return fin;
    }
}
