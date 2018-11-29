import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter fw = new FileWriter("d:\\a.txt");
        /*
         * 创建输出流对象做了哪些事情:
         * 		A:调用系统资源创建了一个文件
         * 		B:创建输出流对象
         * 		C:把输出流对象指向文件
         */
//调用输出流对象的写数据的方法
        //写一个字符串数据
        fw.write("IO流你好,我是葆宁大帝");
        //数据没有直接写到文件，其实是写到了内存缓冲区
        fw.flush();

        //释放资源
        //通知系统释放和该文件相关的资源
        fw.close();

        //while(true) {}
    }
}



