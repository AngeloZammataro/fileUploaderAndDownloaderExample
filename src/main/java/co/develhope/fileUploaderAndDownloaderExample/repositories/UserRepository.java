package co.develhope.fileUploaderAndDownloaderExample.repositories;

import co.develhope.fileUploaderAndDownloaderExample.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
