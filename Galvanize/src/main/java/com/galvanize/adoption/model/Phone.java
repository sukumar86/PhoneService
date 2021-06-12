package com.galvanize.adoption.model;

import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@EqualsAndHashCode
public class Phone {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private long id;
        private String firstname;
        private String lastname;
        private String phoneno;

    public Phone() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public Phone(String firstname, String lastname, String phoneno) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneno = phoneno;
    }
//
//        @Override
//        public String toString() {
//            return "Phone{" +
//                    "firstname='" + firstname + '\'' +
//                    ", lastname='" + lastname + '\'' +
//                    ", phoneno='" + phoneno + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Pupper pupper = (Pupper) o;
//            return Objects.equals(name, pupper.name) && Objects.equals(breed, pupper.breed);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(name, breed);
//        }
//    }

}
