package za.ac.cput.service;

import za.ac.cput.domain.Gallery;

import java.util.List;

public interface IGalleryService extends IService<Gallery, String> {

    List<Gallery> getall();
}
