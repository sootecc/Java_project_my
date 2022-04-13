package chap19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {
		
		//1. ���� ��ü ����
		File rwFile = new File("./chap19/Ex08/bufferedfile");
		
		
		//2. FileWriter�� �̿��� ���� ����(MS949)
		try(Writer writer = new FileWriter(rwFile);
			BufferedWriter bw = new BufferedWriter(writer);){		//������ ����ϱ� ���� Filter
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("�ݰ����ϴ�.", 2, 3);
			bw.flush();
			
		}catch(Exception e ) {}
	
		
		//3. FileReader�� �̿��� ���� �б� (MS-949)
		try(Reader reader = new FileReader(rwFile);
			BufferedReader br = new BufferedReader(reader);){
			
			//BufferedReader�� �߰��� �޼ҵ�: String readLine(), ������ ��: null, �� ���ξ� �д´�.
			//int read(): ������ ��, -1
		
			String data;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
			
		}catch(Exception e) {}
		
		
		
	}
}
