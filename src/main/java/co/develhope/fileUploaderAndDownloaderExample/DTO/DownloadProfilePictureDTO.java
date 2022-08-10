package co.develhope.fileUploaderAndDownloaderExample.DTO;

import co.develhope.fileUploaderAndDownloaderExample.entities.User;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DownloadProfilePictureDTO {

    private User user;
    private byte[] profileImage;
}
