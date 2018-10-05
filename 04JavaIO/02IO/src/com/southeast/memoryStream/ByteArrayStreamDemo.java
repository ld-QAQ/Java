package com.southeast.memoryStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失。
 * 字节数组：
 * 		ByteArrayInputStream
 * 		ByteArrayOutputStream
 * 字符数组：
 * 		CharArrayReader
 * 		CharArrayWriter
 * 字符串：
 * 		StringReader
 * 		StringWriter
 */
public class ByteArrayStreamDemo {
    public static void main(String[] args) throws IOException {
        //写数据
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        for(int i=0;i<10;i++){
            bos.write(("hello"+i).getBytes());
        }

        byte[] bys=bos.toByteArray();
        //读数据
        ByteArrayInputStream bis=new ByteArrayInputStream(bys);

        int by=0;
        while((by=bis.read())!=-1){
            System.out.print((char)by);
        }

       // bos.close();
       // bis.close();
       /*
        通过查看源码我们知道这里什么都没做，所以根本不需要close()
       public void close() throws IOException {
        }*/
    }
}
