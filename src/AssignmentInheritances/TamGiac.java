    package AssignmentInheritances;

    import java.util.Scanner;

    public class TamGiac extends DaGiac {
        public TamGiac(int CanhTamGiac){
            super(3);
            for(int i = 0; i < 3; i++){
                KichThuocCanhDaGiac[i] = CanhTamGiac;

            }

        }

        @Override
        public int ChuViDaGiac(){
            int ChuVi = 0;
            for(int i = 0; i < 3; i++){
                ChuVi += KichThuocCanhDaGiac[i];
            }

            return  ChuVi;
        }



        public boolean isTamGiac(){
            for(int i = 0; i < 3; i++){
            int a = KichThuocCanhDaGiac[0];
            int b = KichThuocCanhDaGiac[1];
            int c = KichThuocCanhDaGiac[2];
            if( a + b > c && b + c >a && a +c > b){
                System.out.println("Day la tam giac");

                return true;
            }
            else {
                System.out.println("Day khong phai la tam giac");
                return false;
            }

        }
            return true;



    }
        public static double DienTichTamGiac(){
            double a = KichThuocCanhDaGiac[0];
            double b = KichThuocCanhDaGiac[1];
            double c = KichThuocCanhDaGiac[2];
            double p = (a + b + c)/2;
            double DienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return DienTich;
        }

    }
