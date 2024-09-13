public class partten {
    static void partten1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }

    }

    static void partten2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

    }

    static void partten3(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }

    }

    static void partten4(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }

    }

    static void partten5(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.println(i + "");
                if (i + j == 6) {
                    System.out.print(i + "" + j + " ");
                }
            }
            System.out.println();
        }

    }

    static void partten6(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void partten7(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num - 1; j == 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void partten10(int num) {
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i + j == num || i == num - 1 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void partten11(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void partten12(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i + j == num + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void partten13(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == j || i + j == num + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void partten14(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == num || i + j == num + 1 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }

    static void partten15(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == num || i + j == num + 1 || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }

    static void partten16(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == num || i + j == num + 1 || j == 1 || i == j || j == num || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }

    static void partten17(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println(" ");
        }
    }

    static void partten18(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i + j >= num + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println(" ");
        }
    }

    static void partten19(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println(" ");
        }
    }

    static void partten20(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i + j <= num + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println(" ");
        }
    }

    static void partten21(int num) {

        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= num; j++) {

                if (i >= j) {
                    count++;
                    System.out.print(count);
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }

    static void partten22(int num) {
        int count = 1;
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {

                if (i >= j) {

                    System.out.print(count);
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
            count++;
        }
    }

    static void partten23(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i + 1; j--) {

                System.out.println("");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    static void partten24(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j > i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        partten6(6);

    }
}
