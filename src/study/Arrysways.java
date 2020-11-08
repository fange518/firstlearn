package study;

import java.util.Arrays;

public class Arrysways {
    public static void main(String[] args) {

        //数组复制
                /*int[] a = new int[] { 18, 62, 68, 82, 65, 9 };

                // copyOfRange(int[] original, int from, int to)
                // 第一个参数表示源数组
                // 第二个参数表示开始位置(取得到)
                // 第三个参数表示结束位置(取不到)
                // 即集合前闭后开
                int[] b = Arrays.copyOfRange(a, 0, 3);

                for (int i = 0; i < b.length; i++) {
                    System.out.print(b[i] + " ");
                }*/
          //转换为字符串
       /* 如果要打印一个数组的内容，就需要通过for循环来挨个遍历，逐一打印
          但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容*/
               /* int[] a = new int[] { 18, 62, 68, 82, 65, 9 };
                String content = Arrays.toString(a);
                System.out.println(content);*/


           //排序
        /*
        在前面章节学习了 选择法排序 和 冒泡法排序，Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能
         */

               /* int[] a = new int[] { 18, 62, 68, 82, 65, 9 };
                System.out.println("排序之前 :");
                System.out.println(Arrays.toString(a));
                Arrays.sort(a);
                System.out.println("排序之后:");
                System.out.println(Arrays.toString(a));

                */

          //搜索
          /*查询元素出现的位置
            需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
            如果数组中有多个相同的元素，查找结果是不确定的
           */

              /*int[] a = new int[] { 18, 62, 68, 82, 65, 9 };

                Arrays.sort(a);

                System.out.println(Arrays.toString(a));
                //使用binarySearch之前，必须先使用sort进行排序
                System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));

               */

              //判断是否相同
                /*比较两个数组的内容是否一样
                第二个数组的最后一个元素是8，和第一个数组不一样，所以比较结果是false

                */

         /*     int[] a = new int[] { 18, 62, 68, 82, 65, 9 };
                int[] b = new int[] { 18, 62, 68, 82, 65, 8 };

                System.out.println(Arrays.equals(a, b));

          */
         //填充
        //使用同一个值，填充整个数组

                int[] a = new int[10];

                Arrays.fill(a, 5);

                System.out.println(Arrays.toString(a));
            }
        }


