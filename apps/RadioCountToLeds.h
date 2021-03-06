


#ifndef RADIO_COUNT_TO_LEDS_H
#define RADIO_COUNT_TO_LEDS_H

typedef nx_struct cs_msg {
 nx_uint8_t coding_scheme;
 nx_int8_t hc;
}control_msg_t;
typedef nx_struct radio_count_msg {
  //nx_uint16_t counter;
  /* Roja Feb 15 Start */
  //nx_uint8_t type;
  /* Roja Feb 15 End */
  nx_uint8_t mode;
  nx_uint8_t rem_pkts;
  nx_uint16_t source;
  nx_uint8_t num_pkts;
  nx_uint16_t pkt[2];
  nx_uint8_t isNACK;
  nx_uint32_t coeff;
  nx_uint32_t ts; /* Roja 02-27-09 */
  nx_uint8_t nackeff;
  nx_uint16_t dest;
  nx_uint8_t timer5fired;
#if defined(PKT_SIZE)
  nx_uint32_t dummy[5];
#endif
  //nx_uint64_t dummy1;
} radio_count_msg_t;

enum {
  AM_RADIO_COUNT_MSG = 8,
};

#define SOURCE 8

//#define TOTAL_PKT 128 // changed to 128  from 1024
//#define QUEUE_SIZE 64
//#define NACKTIME  640
//#define SOURCETIME 15 
//#define BACKOFF 64
//#define NACKBACKOFF 64/
//#define RENACKBACKOFF 64
//#define CACHE_PAGE 128
//#define ROUNDBACK 300

#define LPL_INTERVAL 45
#define RLPL 17//135 
#define TOTAL_PKT 64//64//256//64//1024//64 // changed to 128  from 1024
#define QUEUE_SIZE1 256//64//64//64//64//256//256//64
#if defined(LOW_POWER_LISTENING)
#define NACKTIME  640+8*LPL_INTERVAL
#else
#define NACKTIME  640//470
#endif
#define NACK_NEWPAGE 640//710//500
#define TIMER5  4294967295
#define SOURCETIME 15
#define BACKOFF 64
#define NACKBACKOFF 64
#define RENACKBACKOFF 64
#define CACHE_PAGE 8//32//8//32//8
#if defined(LOW_POWER_LISTENING)
#define ROUNDBACK 640+8*LPL_INTERVAL
#else
#define ROUNDBACK 300 //1350//300
#endif

#define RLPLM 1

#define LPLM 2

#define MODE_INIT LPLM

#define INTRNS 3

#define TIME_FOR_FP 50
#if 0
#define CPTIME 10
#define CTRL 10
#define CTRLR 11
#define TO1 100
#define TO2 200
#define DEC_COUNT 3
#endif
#endif


