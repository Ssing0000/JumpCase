
public class Play {

//	ȿ���̴� �ָ� �ٱ⸦ �����ϰ� �ֽ��ϴ�. ȿ���̴� �ѹ��� 1ĭ, �Ǵ� 2ĭ�� �� �� �ֽ��ϴ�. ĭ�� �� 4�� ���� ��, ȿ���̴�
//	(1ĭ, 1ĭ, 1ĭ, 1ĭ)
//	(1ĭ, 2ĭ, 1ĭ)
//	(1ĭ, 1ĭ, 2ĭ)
//	(2ĭ, 1ĭ, 1ĭ)
//	(2ĭ, 2ĭ)
//	�� 5���� ������� �� �� ĭ�� ������ �� �ֽ��ϴ�. �ָ��ٱ⿡ ���� ĭ�� �� n�� �־��� ��, ȿ���̰� ���� �����ϴ� ����� �� �������� ����ϴ� jumpCase �Լ��� �ϼ��ϼ���. ���� ��� 4�� �Էµȴٸ�, 5�� ��ȯ�� �ָ� �˴ϴ�.
	
	int key_answer = 0;

	public boolean dojump(int num, int key) {
		if (key == num) {
			return true;
		}
		if (key < num) {
			for (int i = 1; i < 3; i++) {
				if (dojump(num, key + i))
					key_answer += 1;
			}
		}
		return false;
	}

	public int jumpCase(int num) {
		dojump(num, 0);
		return key_answer;
	}

	public static void main(String[] args) {
		Play c = new Play();
		int testCase = 5;
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.jumpCase(testCase));
	}

}
