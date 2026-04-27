public class stringVSStringBuffer {
    public static void main(String[] args) {
        String s = new String("vishvajit");
        s.concat("jamdade");
        System.out.println("Using String : "+s);

        StringBuffer sb = new StringBuffer("vishvajit");
        sb.append("jamdade");
        System.out.println("Using StringBuffer : "+sb);
    }
}
