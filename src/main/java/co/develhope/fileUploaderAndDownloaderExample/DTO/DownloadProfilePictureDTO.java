package co.develhope.fileUploaderAndDownloaderExample.DTO;

import co.develhope.fileUploaderAndDownloaderExample.entities.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DownloadProfilePictureDTO {

    private User user;
    private byte[] profileImage;
}
