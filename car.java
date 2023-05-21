import java.util.Scanner;

public class ParkingLotSystem {
    // 停车场容量
    private int capacity;
    // 当前车辆数量
    private int currentCount;
    // 停车场费用
    private double fee;
    // 停车场名称
    private String name;

    // 构造函数
    public ParkingLotSystem(int capacity, String name, double fee) {
        this.capacity = capacity;
        this.currentCount = 0;
        this.name = name;
        this.fee = fee;
    }

    // 进入停车场
    public void enter() {
        if (currentCount >= capacity) {
            System.out.println("停车场已满，无法进入");
            return;
        }
        currentCount++;
        System.out.println("进入停车场，当前车辆数量：" + currentCount);
    }

    // 离开停车场
    public void leave() {
        if (currentCount <= 0) {
            System.out.println("停车场已空，无法离开");
            return;
        }
        currentCount--;
        System.out.println("离开停车场，当前车辆数量：" + currentCount + "，停车费用：" + fee);
    }

    // 获取当前停车场状态
    public void getStatus() {
        System.out.println("停车场名称：" + name);
        System.out.println("停车场容量：" + capacity);
        System.out.println("当前车辆数量：" + currentCount);
        System.out.println("停车费用：" + fee + "元/小时");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入停车场名称：");
        String name = scanner.nextLine();
        System.out.println("请输入停车场容量：");
        int capacity = scanner.nextInt();
        System.out.println("请输入停车费用（元/小时）：");
        double fee = scanner.nextDouble();

        ParkingLotSystem parkingLot = new ParkingLotSystem(capacity, name, fee);

        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1. 进入停车场");
            System.out.println("2. 离开停车场");
            System.out.println("3. 获取停车场状态");
            System.out.println("4. 退出系统");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    parkingLot.enter();
                    break;
                case 2:
                    parkingLot.leave();
                    break;
                case 3:
                    parkingLot.getStatus();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效选择，请重新选择");
                    break;
            }
        }
    }
}
