package Default;

public class story {
public quest start;
public quest current;
story(){
	start= new quest("������ ��� ���","�� ������ ��� ������� �� �������� ������, �� ����� ���������, ��� ��� ������ ���������� ����� �� ������� �� �� �������\n"
			+"(1)������� ������� �� ������, � ������� ��� ��� �������\n"
			+"(2)���������� ����� � ����������� ������ ��� ������"
			,2,50,0,0); {
				start.direction[0]=new quest("�� �����������","��� �������� ������ �����, �� ��������� �� ������",0,-25,0,+25);
		start.direction[1]=new quest("������ �� �� �����, �� ����� ��� �������","� ���� ���� �������� � �����",0,+25,0,0);
		current=start;
	}

}

public void go(int  num) {
	if (num<=current.direction.length) {

		current=current.direction[num-1];

	}
	else System.out.println("�� ������ ������� ��"+current.direction.length+"�������");
}
public boolean isEnd() {
	return current.direction.length==0;
}
}
