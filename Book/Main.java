public class Main {
    public static void main(String[] args) {
        Physicalbook p = new Physicalbook();

        p.setAuthorName("Ustaad baskhu");
        p.setbookNAme("azadi");
        p.setedition("seven 7");
        p.setpage(400);
        p.setlibrarybook(23);

        System.out.println(p.toString());
    }
}
