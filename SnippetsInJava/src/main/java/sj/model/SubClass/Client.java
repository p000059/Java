package sj.model.SubClass;

import sj.model.ClassSuper.Common;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
@Table(name = "client")
public class Client extends Common {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "client")
    private String client;    
}
