package uz.pdp.domains;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Permission {
    private String id;
    private String name;
    private String code;
}
