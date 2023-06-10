package org.binar.kamihikoukiairlines.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Users users;
    @OneToOne(cascade = CascadeType.ALL)
    private Schedule schedule;
    private String bookingCode;
    private String paymentMethod;
    private boolean isSuccess;
    private boolean isValid;

}
