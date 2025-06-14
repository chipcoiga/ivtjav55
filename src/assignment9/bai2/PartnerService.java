package assignment9.bai2;

import java.util.Scanner;

public class PartnerService {
    private PersonRepository repository;

    public PartnerService(PersonRepository repository) {
        this.repository = repository;
    }

    public void createPartner() {
        Partner partner = new Partner();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap No: ");
        int no = scanner.nextInt();
        scanner.nextLine();
        partner.setPersonNo(no);

        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        partner.setName(name);

        int kpi;
        do {
            System.out.println("Nhap kpi: ");
            kpi = scanner.nextInt();
            partner.setKpi(kpi);
        } while (kpi < 0 || kpi > 100);


        System.out.println("Nhap luong: ");
        double salary = scanner.nextDouble();
        partner.setSalary(salary);

        repository.add(partner);
    }
}
