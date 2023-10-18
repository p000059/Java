package sj.model.ClassSuper;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@MappedSuperclass
public abstract class Vehicle extends Common {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "name")
    private String name;
   
    @Column(name = "type")
	private String type;
    
    @Column(name = "wheels")
    private String wheels;
    
    @Column(name = "type_fuel")
    private String typeFuel;
    
    @Column(name = "brand")
    private String brand;
    
    @Column(name = "weight")
    private double weight;
    
    @Column(name = "size")
    private double size;
    
    @Column(name = "number_passengers")
    private int numberPassengers;
}
