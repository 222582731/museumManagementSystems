package za.ac.cput.service;

import za.ac.cput.domain.Artifact;

import java.util.List;

public interface IArtifactService extends IService<Artifact, String>{

    List<Artifact> getal();
}
