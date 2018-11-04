/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:11:48+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:12:53+01:00
*/

private static int B;
private static int H;
private static boolean flag;

static {
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    flag = true;

    if (B <= 0 | H <= 0) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    }
}
