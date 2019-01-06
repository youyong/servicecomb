package org.apache.servicecomb.samples.bmi;

import org.apache.servicecomb.serviceregistry.RegistryUtils;
import org.apache.servicecomb.serviceregistry.api.registry.MicroserviceInstance;
import org.springframework.stereotype.Service;

@Service
public class InstanceInfoServiceImpl implements InstanceInfoService {

    @Override
    public String getInstanceId() {

        MicroserviceInstance instance = RegistryUtils.getMicroserviceInstance();
        if (instance == null) {
            throw new IllegalStateException(
                    "unable to find any service instances, maybe there is problem registering in service center?");
        }

        return instance.getInstanceId();
    }
}