/*
 * Copyright (c) 2005-2006 Arch Rock Corporation
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the
 *   distribution.
 * - Neither the name of the Arch Rock Corporation nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE
 * ARCHED ROCK OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE
 */

/**
 * Implementation of the transmit path for the ChipCon CC2420 radio.
 *
 * @author Jonathan Hui <jhui@archrock.com>
 * @version $Revision: 1.1 $ $Date: 2010/06/01 01:01:44 $
 */

#include "IEEE802154.h"

configuration RCC2420TransmitC {

  provides {
    interface StdControl;
    interface CC2420Transmit;
    interface RadioBackoff;
    interface ReceiveIndicator as EnergyIndicator;
    interface ReceiveIndicator as ByteIndicator;
    interface ValSleepReq;
    interface CC2420PacketDefer;
    interface PendingMsg;
  }
}

implementation {

  components RCC2420TransmitP,RandomC;
  StdControl = RCC2420TransmitP;
  CC2420Transmit = RCC2420TransmitP;
  RadioBackoff = RCC2420TransmitP;
  EnergyIndicator = RCC2420TransmitP.EnergyIndicator;
  ByteIndicator = RCC2420TransmitP.ByteIndicator;
  ValSleepReq = RCC2420TransmitP;
  CC2420PacketDefer = RCC2420TransmitP;
  PendingMsg = RCC2420TransmitP;
  components MainC;
  MainC.SoftwareInit -> RCC2420TransmitP;
  MainC.SoftwareInit -> Alarm;
  
  components AlarmMultiplexC as Alarm;
  RCC2420TransmitP.BackoffTimer -> Alarm;
  RCC2420TransmitP.Random->RandomC;
  components HplCC2420PinsC as Pins;
  RCC2420TransmitP.CCA -> Pins.CCA;
  RCC2420TransmitP.CSN -> Pins.CSN;
  RCC2420TransmitP.SFD -> Pins.SFD;

  components HplCC2420InterruptsC as Interrupts;
  RCC2420TransmitP.CaptureSFD -> Interrupts.CaptureSFD;

  components new CC2420SpiC() as Spi;
  RCC2420TransmitP.SpiResource -> Spi;
  RCC2420TransmitP.ChipSpiResource -> Spi;
  RCC2420TransmitP.SNOP        -> Spi.SNOP;
  RCC2420TransmitP.STXON       -> Spi.STXON;
  RCC2420TransmitP.STXONCCA    -> Spi.STXONCCA;
  RCC2420TransmitP.SFLUSHTX    -> Spi.SFLUSHTX;
  RCC2420TransmitP.TXCTRL      -> Spi.TXCTRL;
  RCC2420TransmitP.TXFIFO      -> Spi.TXFIFO;
  RCC2420TransmitP.TXFIFO_RAM  -> Spi.TXFIFO_RAM;
  RCC2420TransmitP.MDMCTRL1    -> Spi.MDMCTRL1;

  components RCC2420ReceiveC;
  RCC2420TransmitP.SetBackoff  -> RCC2420ReceiveC;  
  RCC2420TransmitP.CC2420Receive -> RCC2420ReceiveC;
  
  components RCC2420PacketC;
  RCC2420TransmitP.CC2420Packet -> RCC2420PacketC;
  RCC2420TransmitP.CC2420PacketBody -> RCC2420PacketC;
  RCC2420TransmitP.PacketTimeStamp -> RCC2420PacketC;
  RCC2420TransmitP.PacketTimeSyncOffset -> RCC2420PacketC;

  components new TimerMilliC() as Timer1;
  RCC2420TransmitP.MilliTimer1 -> Timer1;
  components LedsC;
  RCC2420TransmitP.Leds -> LedsC;

  components WrapperC;
  RCC2420TransmitP.Mode -> WrapperC;
}
