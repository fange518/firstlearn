package study;

public class erweiarry {
   /*
   初始化二维数组
    */
        public static void main(String[] args) {
            //初始化二维数组，
            int a[][]  = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
            a[1][2] = 5;
            a[0][2]=6;
            //可以直接访问一维数组，因为已经分配了空间

            //System.out.println(a[0][2]);

            //只分配了二维数组
            int[][] b = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
            b[0]  =new int[3]; //必须事先分配长度，才可以访问
            b[0][2] = 5;

            //指定内容的同时，分配空间
            int[][] c = new int[][]{
                    {1,2,4},
                    {4,5},
                    {6,7,8,9}
            };

            System.out.println(c[0][1]);

        }
    }

