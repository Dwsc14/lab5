public class test {
    public static void main(String[] args) {
        String nName = " Nguyen   Anh  Duc";
        nName = nName.trim();
        nName = nName.replaceAll("\\s+", " ");
        System.out.println(nName);
    }
}
