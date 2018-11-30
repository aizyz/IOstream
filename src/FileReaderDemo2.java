import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class FileReaderDemo2 {

    /*
     * 需求：从文件中读数据并显示到控制台
     * 		读数据--输入流--FileReader
     *
     * FileReader:
     * 		FileReader(String fileName):传递文件名称
     *
     * 输入流读文件的步骤：
     * 		A:创建输入流对象
     * 		B:调用输入流对象的读数据方法
     * 		C:释放资源
     *
     * java.io.FileNotFoundException: fr.txt (系统找不到指定的文件。)
     */

        public static void main(String[] args) throws IOException {
            //创建输入流对象
//		FileReader fr = new FileReader("fr.txt");
            FileReader fr = new FileReader("Copy.java");
           /* char[] chs = new char[1024];
            /第一次读数据
            int len = fr.read(chs);
            System.out.println("len:"+len);
            //System.out.println(new String(chs));
            System.out.println(new String(chs,0,len));

            //第二次读数据
            len = fr.read(chs);
            System.out.println("len:"+len);
            //System.out.println(new String(chs));
            System.out.println(new String(chs,0,len));
            //第三次读数据
            len = fr.read(chs);
            System.out.println("len:"+len);
            //System.out.println(new String(chs));
            System.out.println(new String(chs,0,len));

		*/
		    char[] chs = new char[1024];
            int len;
            //1:fr.read()
            //2:len=fr.read()
            //3:len != -1
            while((len=fr.read(chs))!=-1) {

                System.out.print(new String(chs,0,len));
            }

            //释放资源
            fr.close();

        }
    }


