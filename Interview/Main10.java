import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
单词数组左右对齐
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
    给定一个单词数组和一个长度 maxWidth，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
    你应该使用“贪心算法”来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有maxWidth 个字符。
    要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
    文本的最后一行应为左对齐，且单词之间不插入额外的空格。

    说明:
    单词是指由非空格字符组成的字符序列。
    每个单词的长度大于 0，小于等于 maxWidth。
    输入单词数组 words 至少包含一个单词。
    输入
    一个单词数组和一个长度 maxWidth
    输出
    重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本


    样例输入
    I'm,king,of,the,world
    3
    样例输出
    I'm
    king
    of
    the
    world

    Hint
    class Solution {
        public List fullJustify(String[] words, int maxWidth) {

        }
    }
 */
public class Main10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();

        String[] strArray = str.split(",");
        for(int i=0; i<strArray.length ; i++){
            System.out.println(strArray[i]);
        }
    }

    public List fullJustify(String[] words, int maxWidth) {
        return new ArrayList();
    }

  /*  public List fullJustify(String[] words, int maxWidth) {

        List list = new ArrayList<>();
        if(words.length < 1){ list.add(addString(words,-1,-1,maxWidth)); return list; }
        int start = 0, end = 0, tmp = words[0].length();
        for(int i = 0; i < words.length; i++){
            if(i == words.length - 1 || tmp + words[i + 1].length() + 1 > maxWidth){
                if(end != words.length - 1){
                    list.add(addString(words, start, end, start == end ? maxWidth - words[start].length() : maxWidth - tmp));
                }else{
                    String str = ""; tmp = 0;
                    while(str.length() < maxWidth){
                        if(start <= end) str += words[start];
                        start ++; if(str.length() < maxWidth) str += " ";
                    }

                    list.add(str); break;
                }
                start = i + 1; end = start; tmp = start < words.length ? words[start].length() : 0;

            }else{
                end ++;  tmp += (words[i + 1].length() + 1);
            }

        }

        return list;

    }

    public String addString(String[] words, int start, int end, int number){

        String str = "";
        if(end == start + 1) return words[start] + spaces(number + 1) + words[end];
        if(start == end) return words[start] + spaces(number);
        if(start < 0) return spaces(number);
        int[] interval = new int[end - start]; int j = 0; number += end - start;
        while(number-- > 0){
            interval[j]++; j++; if(j == interval.length) j = 0;
        }

        for(int i = 0; i < end - start; i++){
            str += (words[start + i] + spaces(interval[i]));

        }
        return str + words[end];

    }

    public String spaces(int number){

        String space = "";
        for(int i = 0; i < number; i++) space += " ";
        return space;
    }*/
}
