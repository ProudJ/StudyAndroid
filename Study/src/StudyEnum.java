import java.util.Scanner;

public class StudyEnum {

    public static enum CODE {
        // int�� 3�� String�� 1�� boolean�� 1��¥�� ������ Ÿ���� ����.
        CODE_1(1),
        CODE_2(2),
        CODE_3(3),
        CODE_4("�ڵ�"),
        CODE_5(true);

        private int intCode;
        private String stringCode;
        private boolean booleanCode;

        // �� ������ Ÿ���� �����ڵ�.
        CODE(int code) {
            this.intCode = code;
        }

        CODE(String code) {
            this.stringCode = code;
        }

        CODE(boolean code) {
            this.booleanCode = code;
        }

        // �� Ÿ���� ���� �������� ����
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
        // ordinal�� enumŸ�Կ��� �ش� �������� ������ �����´� (0������ ����)
        System.out.println(CODE.CODE_1.ordinal()); // ó���̴ϱ� 0��
        System.out.println(CODE.CODE_2.ordinal()); // 2��°�� ��������ϱ� 1��

        // �����ڷ� ���� �־��ְ� ��������. CODE_2�� int Ÿ���ε� String���� �������ϱ� null��.
        System.out.println(CODE.CODE_2.getStringId());
        
        // CODE_4���� String�̰� String �����ڿ� ���� �־������ϱ� ���� ������ �� ����.
        System.out.println(CODE.CODE_4.getStringId());
        System.out.println(CODE.CODE_5.getbooleanId());

        // �Է¹��� ��ȣ�� ����ϱ� ���� ��ȣ�� �޾ƿ�.
        int result = getScannerValue();
        // ���� ��ȣ�� ������� �ڵ��� ��ȣ�� ã��
        CODE code = getCodeFromInt(result);
        if (code != null) {
            // �ڵ带 ������� ���
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
        System.out.println("��ȣ �Է�");
    	Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (Exception e) {
            System.out.println("���ڸ� �Է�");
        	getScannerValue();
        }
        return 0;
    }

    public static void printValue(CODE code) {
        switch (code) {
        case CODE_1:
            System.out.println("�̸�" + CODE.CODE_1.name());
            System.out.println("��ȣ" + CODE.CODE_1.ordinal());
            System.out.println("��" + CODE.CODE_1.getIntId());
            break;
        case CODE_2:
            System.out.println("�̸�" + CODE.CODE_2.name());
            System.out.println("��ȣ" + CODE.CODE_2.ordinal());
            System.out.println("��" + CODE.CODE_2.getIntId());
            break;
        case CODE_3:
            System.out.println("�̸�" + CODE.CODE_3.name());
            System.out.println("��ȣ" + CODE.CODE_3.ordinal());
            System.out.println("��" + CODE.CODE_3.getIntId());
            break;
        case CODE_4:
            System.out.println("�̸�" + CODE.CODE_4.name());
            System.out.println("��ȣ" + CODE.CODE_4.ordinal());
            System.out.println("��" + CODE.CODE_4.getIntId());
            break;
        case CODE_5:
            System.out.println("�̸�" + CODE.CODE_5.name());
            System.out.println("��ȣ" + CODE.CODE_5.ordinal());
            System.out.println("��" + CODE.CODE_5.getIntId());
            break;

        default:
            break;
        }
    }
}
