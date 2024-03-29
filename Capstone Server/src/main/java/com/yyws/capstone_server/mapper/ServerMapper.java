package com.yyws.capstone_server.mapper;

import com.yyws.capstone_server.dto.DeviceDto;
import com.yyws.capstone_server.dto.ModelDto;
import com.yyws.capstone_server.entity.Device;
import com.yyws.capstone_server.entity.Model;

public class ServerMapper {

    public static DeviceDto DeviceToDeviceDto(Device device, DeviceDto deviceDto) {
        deviceDto.setId(device.getId());
        deviceDto.setName(device.getName());
        deviceDto.setCpuFrequency(device.getCpuFrequency());
        deviceDto.setSram(device.getSram());
        deviceDto.setFlash(device.getFlash());
        deviceDto.setCpuArch(device.getCpuArch());
        return deviceDto;
    }

    public static ModelDto ModelToModelDtos(Model model, ModelDto modelDto) {
        modelDto.setId(model.getId());
        modelDto.setName(model.getName());
        return modelDto;
    }
}
