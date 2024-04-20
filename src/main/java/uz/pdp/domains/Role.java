package uz.pdp.domains;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Role {
    private String id;
    private String name;
    private String code;


}
