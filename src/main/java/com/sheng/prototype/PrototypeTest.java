package com.sheng.prototype;

/**
 * Created by sheng on 17/11/2018
 *
 * @author sheng
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resumeA = new Resume();
        resumeA.setId("1");
        resumeA.setName("sheng");
        Company companyA = new Company();
        companyA.setAddress("天涯海角");
        companyA.setName("SF");
        resumeA.setCompany(companyA);

        Resume resumeB = (Resume) resumeA.clone();
        resumeB.getCompany().setName("Tencent");

        System.out.println(resumeA.hashCode());
        System.out.println(resumeB.hashCode());
        System.out.println(resumeA.getCompany().hashCode());
        System.out.println(resumeB.getCompany().hashCode());
        System.out.println("resumeA company name : " + resumeA.getCompany().getName());
        System.out.println("resumeB company name : " + resumeB.getCompany().getName());
        System.out.println(resumeA.equals(resumeB));
        System.out.println(resumeA.getCompany().equals(resumeB.getCompany()));
    }
}
