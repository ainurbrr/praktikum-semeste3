package tugas1;

public class permute {
    public void permuteWithRecursive(String str, String hasil){  //time complexity O(n!)
        if (str.length()==0){
            System.out.println(hasil);
        }

        for (int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            String substringKiri = str.substring(0,i);
            String substringKanan = str.substring(i+1);
            String after = substringKiri+substringKanan;
            permuteWithRecursive(after, hasil + ch);
        }

    }


    public void permuteNonRecursive(String string){ //time complexity O(n+n^2)
        int [] faktorial = new int[string.length()+1];
        faktorial[0] = 1;
        for (int i = 1; i<=string.length();i++) {
            faktorial[i] = faktorial[i-1] * i;
        }

        for (int i = 0; i < faktorial[string.length()]; i++) {
            String Permutation="";
            String temp = string;
            int posisi = i;
            for (int position = string.length(); position > 0 ;position--){
                int selected = posisi / faktorial[position-1];
                Permutation += temp.charAt(selected);
                posisi = posisi % faktorial[position-1];
                temp = temp.substring(0,selected) + temp.substring(selected+1);
            }
            System.out.println(Permutation);
        }
    }
}
