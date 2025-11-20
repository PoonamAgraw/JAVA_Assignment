package com.demo.test;

import com.demo.beans.FileSearch;
import com.demo.thread.FileSearchThread;

public class TestFileSearch {

	public static void main(String[] args) {
		String[] strarr= {"red","purple","orange","white","yellow"};
        FileSearch fs=new FileSearch();
        FileSearchThread[] arr=new  FileSearchThread[strarr.length];
        for(int i=0;i<strarr.length;i++) {
	      arr[i]=new FileSearchThread(fs, strarr[i]);
	      arr[i].start();
        }
	}

}