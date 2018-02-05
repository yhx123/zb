package com.lsjs.zb.cache;

import com.lsjs.zb.common.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.TimeUnit;


@Repository
public class RedisService
{
    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }

    /**
     * 缓存基本的对象，Integer、String、实体类等
     * @param key 缓存的键值
     * @param value 缓存的值
     * @return  缓存的对象
     */
    public <T> ValueOperations<String,T> setObject(String key,T value, Long time)
    {
        ValueOperations<String,T> operation = redisTemplate.opsForValue();
        operation.set(key,value, time, TimeUnit.MINUTES);
        return operation;
    }

    /**
     * 缓存基本的对象，Integer、String、实体类等
     * @param key 缓存的键值
     * @param value 缓存的值
     * @return  缓存的对象
     */
    public <T> ValueOperations<String,T> setObject(String key,T value)
    {
        ValueOperations<String,T> operation = redisTemplate.opsForValue();
        operation.set(key, value);
        this.setDefaultExpire(key);
        return operation;
    }

    /**
     * 获得缓存的基本对象。
     * @param key  缓存键值
     * @return   缓存键值对应的数据
     */
    public <T> T getObject(String key)
    {
        ValueOperations<String,T> operation = redisTemplate.opsForValue();
        return operation.get(key);
    }

    /**
     * 缓存List数据
     * @param key  缓存的键值
     * @param dataList 待缓存的List数据
     * @return   缓存的对象
     */
    public <T> ListOperations<String, T> setList(String key,List<T> dataList)
    {
        ListOperations listOperation = redisTemplate.opsForList();
        if(null != dataList)
        {
            int size = dataList.size();
            for(int i = 0; i < size ; i ++)
            {
                listOperation.rightPush(key,dataList.get(i));
            }
        }
        this.setDefaultExpire(key);
        return listOperation;
    }

    /**
     * 获得缓存的list对象
     * @param key 缓存的键值
     * @return  缓存键值对应的数据
     */
    public <T> List<T> getList(String key)
    {
        List<T> dataList = new ArrayList<T>();
        ListOperations<String,T> listOperation = redisTemplate.opsForList();
        Long size = listOperation.size(key);

        for(int i = 0 ; i < size ; i ++)
        {
            dataList.add((T)listOperation.leftPop(key));
        }

        return dataList;
    }

    /**
     * 缓存Set
     * @param key  缓存键值
     * @param dataSet 缓存的数据
     * @return   缓存数据的对象
     */
    public <T> BoundSetOperations<String,T> setSet(String key,Set<T> dataSet)
    {
        BoundSetOperations<String,T> setOperation = redisTemplate.boundSetOps(key);
        Iterator<T> it = dataSet.iterator();
        while(it.hasNext())
        {
            setOperation.add(it.next());
        }
        this.setDefaultExpire(key);
        return setOperation;
    }

    /**
     * 获得缓存的set
     * @param key 缓存键值
     * @return 缓存数据的对象
     */
    public Set getSet(String key)
    {
        Set dataSet = new HashSet();
        BoundSetOperations operation = redisTemplate.boundSetOps(key);

        Long size = operation.size();
        for(int i = 0 ; i < size ; i++)
        {
            dataSet.add(operation.pop());
        }
        return dataSet;
    }

    /**
     * 缓存Map
     * @param key  缓存键值
     * @param dataMap 缓存的数据
     * @return
     */
    public <T> HashOperations<String,String,T> setMap(String key,Map<String,T> dataMap)
    {

        HashOperations hashOperations = redisTemplate.opsForHash();
        if(null != dataMap)
        {
            for (Map.Entry<String, T> entry : dataMap.entrySet()) {
                hashOperations.put(key,entry.getKey(),entry.getValue());
            }
        }
        this.setDefaultExpire(key);
        return hashOperations;
    }

    /**
     * 获得缓存的Map
     * @param key 缓存键值
     * @return
     */
    public <T> Map<String,T> getMap(String key)
    {
        Map<String, T> map = redisTemplate.opsForHash().entries(key);
        return map;
    }


    /**
     * 实现命令：DEL key，删除一个key
     * @param key 缓存的键值
     */
    public void del(String key){
        redisTemplate.delete(key);
    }

    /**
     * 设置默认失效时间
     * @param key
     */
    public void setDefaultExpire(String key){
        this.redisTemplate.expire(key, Constant.REDIS_DEFAULT_EXPIRE, TimeUnit.SECONDS);
    }

}
