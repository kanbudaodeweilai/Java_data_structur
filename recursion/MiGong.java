package Java_data_structur.recursion;

public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        // 上下设置为墙壁
        for (int i =0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        // 左右设置为墙壁
        for (int i =0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }
        // 设置墙壁
        map[3][1]=1;
        map[3][2]=1;
        for (int i = 0;i<8;i++){
            for (int j = 0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        setWay(map,1,1);
        System.out.println("********************************");
        for (int i = 0;i<8;i++){
            for (int j = 0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
    /*
    1.如果小球能到map[6][5]的位置，则证明有通路
    2.约定：当map[i][j]为0表示没有走过，为1则为墙壁，2通路，3走过但是走不通
    3.策略 走 下->右->上->左的路线，如果改路线走不通，则回溯
     */
    /**
     *
     * @param map 地图
     * @param i 出发位置的横坐标
     * @param j 出发位置的纵坐标
     * @return 找到通路就返回true 没有找到就返回false
     */
    public static boolean setWay(int[][] map,int i,int j){
        if (map[6][5]==2){
            return true;

        }else {
            if (map[i][j]==0){
                map[i][j]=2;
                if (setWay(map,i+1,j)){
                    return true;
                }else if (setWay(map,i,j+1)){
                    return true;
                }else if (setWay(map,i-1,j)){
                    return true;
                }else if (setWay(map,i,j-1)){
                    return true;
                }else {
                    map[i][j]=3;
                    return false;
                }
            }else {
                return false;
            }

        }

    }

}
