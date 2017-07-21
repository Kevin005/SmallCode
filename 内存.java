    /**
     * byte(字节)根据长度转成kb(千字节)和mb(兆字节)
     *
     * @param bytes
     * @return
     */
    public static float bytes2Mb(long bytes) {
        BigDecimal filesize = new BigDecimal(bytes);
        BigDecimal megabyte = new BigDecimal(1024 * 1024);//1MB
        float returnValue = filesize.divide(megabyte, 2, BigDecimal.ROUND_UP).floatValue();//强制进一并保留两位
        if (returnValue > 1)//大于1MB
            return returnValue;//单位MB
        BigDecimal kilobyte = new BigDecimal(1024);//1KB
        returnValue = filesize.divide(kilobyte, 2, BigDecimal.ROUND_UP).floatValue();
        return returnValue;//单位KB
    }