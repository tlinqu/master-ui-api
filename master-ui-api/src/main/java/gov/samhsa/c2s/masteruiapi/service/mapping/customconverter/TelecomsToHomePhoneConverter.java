package gov.samhsa.c2s.masteruiapi.service.mapping.customconverter;

import gov.samhsa.c2s.masteruiapi.infrastructure.dto.TelecomDto;
import gov.samhsa.c2s.masteruiapi.infrastructure.dto.UmsUserDto;
import gov.samhsa.c2s.masteruiapi.service.mapping.System;
import gov.samhsa.c2s.masteruiapi.service.mapping.Use;
import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class TelecomsToHomePhoneConverter extends AbstractConverter<UmsUserDto, String> {
    @Override
    protected String convert(UmsUserDto source) {
        return source.getTelecoms().stream()
                .filter(telecomDto -> telecomDto.getSystem().equalsIgnoreCase(System.PHONE.toString())
                        && telecomDto.getUse().equalsIgnoreCase(Use.HOME.toString()))
                .map(TelecomDto::getValue)
                .findFirst()
                .orElse(null);
    }
}
