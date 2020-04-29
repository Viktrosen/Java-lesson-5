public class MainClass {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[]a1 = new float[h];
    static float[]a2 = new float[h];


    static class MyRunnableClass implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < h ; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }

    static class MyRunnableClass2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < h ; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }



    public void method1() {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        new MyRunnableClass().run();
        new MyRunnableClass2().run();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis()-a);
    }

    public void method2() {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis()-a);
    }


    public static void main(String[] args) {
        new MainClass().method2();
    }
}
