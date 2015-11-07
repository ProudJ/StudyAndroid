import java.util.Scanner;

public class StudyEnum {

    public static enum CODE {
        // int형 3개 String형 1개 boolean형 1개짜리 데이터 타입을 만듬.
        CODE_1(1),
        CODE_2(2),
        CODE_3(3),
        CODE_4("코드"),
        CODE_5(true);

        private int intCode;
        private String stringCode;
        private boolean booleanCode;

        // 각 데이터 타입의 생성자들.
        CODE(int code) {
            this.intCode = code;
        }

        CODE(String code) {
            this.stringCode = code;
        }

        CODE(boolean code) {
            this.booleanCode = code;
        }

        // 각 타입의 값을 가져오기 위함
        public int getIntId() {
            return intCode;
        }

        public String getStringId() {
            return stringCode;
        }

        public boolean getbooleanId() {
            return booleanCode;
        }
    }

    public static void main(String[] arg) {
        // ordinal은 enum타입에서 해당 데이터의 순서를 가져온다 (0번부터 시작)
        System.out.println(CODE.CODE_1.ordinal()); // 처음이니까 0번
        System.out.println(CODE.CODE_2.ordinal()); // 2번째로 만들었으니까 1번

        // 생성자로 값을 넣어주고 가져오기. CODE_2는 int 타입인데 String형을 가져오니까 null임.
        System.out.println(CODE.CODE_2.getStringId());
        
        // CODE_4번은 String이고 String 생성자에 값을 넣어줬으니까 값을 가져올 수 있음.
        System.out.println(CODE.CODE_4.getStringId());
        System.out.println(CODE.CODE_5.getbooleanId());

        // 입력받은 번호를 출력하기 위해 번호를 받아옴.
        int result = getScannerValue();
        // 받은 번호를 기반으로 코드의 번호를 찾음
        CODE code = getCodeFromInt(result);
        if (code != null) {
            // 코드를 기반으로 출력
            printValue(code);
        } else {
        	System.out.println("Error");
        }
    }

    public static CODE getCodeFromInt(int ordinal) {
        switch (ordinal) {
		case 1:
			return CODE.CODE_1;
		case 2:
			return CODE.CODE_2;
		case 3:
			return CODE.CODE_3;
		case 4:
			return CODE.CODE_4;
		case 5:
			return CODE.CODE_5;
		default:
			return null;
		}
    }

    public static int getScannerValue() {
        System.out.println("번호 입력");
    	Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (Exception e) {
            System.out.println("숫자만 입력");
        	getScannerValue();
        }
        return 0;
    }

    public static void printValue(CODE code) {
        switch (code) {
        case CODE_1:
            System.out.println("이름" + CODE.CODE_1.name());
            System.out.println("번호" + CODE.CODE_1.ordinal());
            System.out.println("값" + CODE.CODE_1.getIntId());
            break;
        case CODE_2:
            System.out.println("이름" + CODE.CODE_2.name());
            System.out.println("번호" + CODE.CODE_2.ordinal());
            System.out.println("값" + CODE.CODE_2.getIntId());
            break;
        case CODE_3:
            System.out.println("이름" + CODE.CODE_3.name());
            System.out.println("번호" + CODE.CODE_3.ordinal());
            System.out.println("값" + CODE.CODE_3.getIntId());
            break;
        case CODE_4:
            System.out.println("이름" + CODE.CODE_4.name());
            System.out.println("번호" + CODE.CODE_4.ordinal());
            System.out.println("값" + CODE.CODE_4.getIntId());
            break;
        case CODE_5:
            System.out.println("이름" + CODE.CODE_5.name());
            System.out.println("번호" + CODE.CODE_5.ordinal());
            System.out.println("값" + CODE.CODE_5.getIntId());
            break;

        default:
            break;
        }
    }
}
