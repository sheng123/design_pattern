package com.sheng.prototype;

import lombok.*;

import java.io.*;

/**
 * Created by sheng on 17/11/2018
 *
 * @author sheng
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Resume implements Cloneable, Serializable {

    private String id;
    private String name;
    private Company company;

    public Resume(Company company) throws CloneNotSupportedException {
        this.company = (Company) company.clone();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepCloneB();
    }

    private Resume deepCloneA() throws CloneNotSupportedException {
        Resume resume = new Resume(this.company);
        resume.setId(this.getId());
        resume.setName(this.getName());

        return resume;
    }

    private Object deepCloneB() {

        try {

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(bos);

            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Resume resume = (Resume) ois.readObject();

            return resume;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}
