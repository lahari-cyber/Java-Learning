class stringbuilder {
public static void main(String args[]){
    String str = "MRU";
    StringBuilder sb = new StringBuilder(str);
    sb.append("-SOE-II");
    String nStr = sb.toString();
    System.out.println(nStr);
}    
}
