package first.first.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;
import java.util.PrimitiveIterator;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ErrorReponse {

    private String errorCode;
    private String Message;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime rdate;
}
