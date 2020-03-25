package builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {        // Builder�� Subclass�� �ν��Ͻ��� �־����Ƿ�
        this.builder = builder;             // builder �ʵ忡 ������ �д�.
    }
    public void construct() {               		// ��������
        builder.makeTitle("Greeting");              // Ÿ��Ʋ
        builder.makeString("��ħ�� ����");         // ���ڿ�
        builder.makeItems(new String[]{            // �����׸�
            "���� ��ħ�Դϴ�",
            "�ȳ��ϼ���",
        });
        builder.makeString("�㿡");                // ������ ���ڿ�
        builder.makeItems(new String[]{           // ������ �����׸�
            "�ȳ��ϼ���",
            "�ȳ��� �ֹ�����",
            "�ȳ��� �輼��",
        });
        builder.close();                           // ������ �ϼ���Ų��
    }
}
